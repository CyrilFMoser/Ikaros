package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[(Byte,Byte), Boolean], Int], T_A[Boolean, T_A[Byte, Boolean]]]
case class CC_B(a: T_A[(CC_A,CC_A), Byte]) extends T_A[T_A[T_A[(Byte,Byte), Boolean], Int], T_A[Boolean, T_A[Byte, Boolean]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[(Byte,Byte), Boolean], Int], T_A[Boolean, T_A[Byte, Boolean]]]

val v_a: T_A[T_A[T_A[(Byte,Byte), Boolean], Int], T_A[Boolean, T_A[Byte, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}