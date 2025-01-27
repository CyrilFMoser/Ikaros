package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: T_A[T_A[T_B]], c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: Int) extends T_B
case class CC_C(a: CC_A, b: Int, c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_, _, CC_B(_)), _, _) => 1 
  case CC_C(CC_A(_, _, CC_C(_, _, _)), _, _) => 2 
}
}