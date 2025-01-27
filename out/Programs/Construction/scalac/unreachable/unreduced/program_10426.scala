package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[Byte, T_A[T_A[Int, Boolean], T_A[Byte, Byte]]]
case class CC_B(a: T_A[Int, CC_A], b: Char, c: (T_A[(Byte,Boolean), Boolean],CC_A)) extends T_A[Byte, T_A[T_A[Int, Boolean], T_A[Byte, Byte]]]
case class CC_C(a: CC_B, b: CC_A) extends T_A[Byte, T_A[T_A[Int, Boolean], T_A[Byte, Byte]]]

val v_a: T_A[Byte, T_A[T_A[Int, Boolean], T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, (_,CC_A())) => 1 
  case CC_C(_, _) => 2 
}
}