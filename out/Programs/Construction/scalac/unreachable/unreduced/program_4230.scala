package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: (T_A[Char],T_A[T_B])) extends T_A[Char]
case class CC_B(a: T_A[Char]) extends T_B
case class CC_C(a: (T_A[CC_B],T_A[Char])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_))) => 0 
  case CC_C(_) => 1 
}
}