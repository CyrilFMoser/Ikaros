package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, T_A[D, D]], c: Byte) extends T_A[T_A[T_B[(Boolean,Boolean)], T_B[Int]], D]
case class CC_B[E, F]() extends T_A[E, F]
case class CC_C[G](a: T_B[G], b: Boolean) extends T_A[T_A[T_B[(Boolean,Boolean)], T_B[Int]], G]
case class CC_D(a: CC_B[T_A[Byte, Boolean], T_B[Boolean]], b: Byte) extends T_B[T_B[(Boolean,Byte)]]

val v_a: T_A[T_A[T_B[(Boolean,Boolean)], T_B[Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), CC_B(), 0) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_A(CC_B(), CC_B(), _)