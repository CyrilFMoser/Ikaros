package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int, b: (T_A[Boolean, Int],T_A[Char, (Int,Boolean)])) extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Char]], T_A[T_A[Char, Char], (Boolean,Char)]]
case class CC_B(a: CC_A, b: CC_A, c: T_A[T_A[CC_A, CC_A], T_A[CC_A, CC_A]]) extends T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Char]], T_A[T_A[Char, Char], (Boolean,Char)]]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Boolean, Char]], T_A[T_A[Char, Char], (Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, (_,_)), CC_A(_, _), _) => 1 
}
}