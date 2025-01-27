package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, ((Char,Byte),T_A[Int, Byte])]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, Boolean]
case class CC_C[E](a: T_A[E, Boolean]) extends T_A[E, Boolean]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_B(_)) => 1 
  case CC_C(CC_C(CC_B(_))) => 2 
  case CC_C(CC_C(CC_C(_))) => 3 
}
}