package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[Boolean, (T_B[Byte, Byte],T_B[Boolean, Int])]
case class CC_B[E, F](a: CC_A) extends T_A[E, F]

val v_a: T_A[T_A[Boolean, (T_B[Byte, Byte],T_B[Boolean, Int])], Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}