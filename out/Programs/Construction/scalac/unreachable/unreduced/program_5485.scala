package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: C) extends T_A[T_A[T_A[Byte, Boolean], Boolean], C]
case class CC_B[D]() extends T_A[T_A[T_A[Byte, Boolean], Boolean], D]

val v_a: T_A[T_A[T_A[Byte, Boolean], Boolean], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}