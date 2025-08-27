-- 코드를 입력하세요
-- FIRST_HALF, ICECREAM_INFO
-- FLAVOR
-- 상반기 아이스크림 총 주문량이 3,000보다 높고, 주 성분이 과일인아이스크림으 ㅣ맛
-- 주문량이 큰 순서대로 조회
SELECT I.FLAVOR
FROM FIRST_HALF H, ICECREAM_INFO I 
WHERE H.FLAVOR = I.FLAVOR AND
I.INGREDIENT_TYPE LIKE 'fruit%' AND H.TOTAL_ORDER > 3000;