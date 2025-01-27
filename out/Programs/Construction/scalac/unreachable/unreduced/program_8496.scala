package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Boolean, Char], T_A[Byte, Int]]) extends T_A[T_A[T_A[Char, Int], (Char,(Char,Boolean))], T_A[T_A[(Boolean,Boolean), Char], T_A[Byte, Int]]]
case class CC_B(a: Byte, b: CC_A) extends T_A[T_A[T_A[Char, Int], (Char,(Char,Boolean))], T_A[T_A[(Boolean,Boolean), Char], T_A[Byte, Int]]]
case class CC_C(a: CC_B) extends T_A[T_A[T_A[Char, Int], (Char,(Char,Boolean))], T_A[T_A[(Boolean,Boolean), Char], T_A[Byte, Int]]]

val v_a: T_A[T_A[T_A[Char, Int], (Char,(Char,Boolean))], T_A[T_A[(Boolean,Boolean), Char], T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_C(CC_B(_, _)) => 2 
}
}