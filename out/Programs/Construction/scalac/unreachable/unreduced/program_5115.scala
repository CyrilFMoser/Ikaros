package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[(Boolean,Byte), T_A[Char, Byte]]]
case class CC_B(a: T_A[T_B[Byte], T_B[Byte]], b: CC_A[T_B[Boolean]], c: T_B[Byte]) extends T_B[Byte]
case class CC_C(a: CC_B, b: T_B[Byte]) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(), CC_B(_, _, _)) => 0 
  case CC_B(_, CC_A(), CC_C(_, _)) => 1 
  case CC_C(_, _) => 2 
}
}