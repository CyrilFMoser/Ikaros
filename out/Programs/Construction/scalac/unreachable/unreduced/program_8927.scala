package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: C, c: T_B) extends T_A[T_B, C]
case class CC_B(a: (T_A[T_B, T_B],T_A[Int, T_B]), b: T_B) extends T_B
case class CC_C[D](a: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_, _, _),_), CC_B(_, _)) => 0 
  case CC_B((CC_A(_, _, _),_), CC_C(CC_B(_, _))) => 1 
  case CC_C(CC_B(_, _)) => 2 
}
}