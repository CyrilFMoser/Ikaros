package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], (T_A[Int, Boolean],T_A[Byte, Byte])]
case class CC_B(a: T_A[T_A[Byte, CC_A], CC_A], b: CC_A) extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], (T_A[Int, Boolean],T_A[Byte, Byte])]
case class CC_C(a: CC_A) extends T_A[T_A[T_A[Char, Int], T_A[Char, Int]], (T_A[Int, Boolean],T_A[Byte, Byte])]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Char, Int]], (T_A[Int, Boolean],T_A[Byte, Byte])] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_C(CC_A()) => 2 
}
}