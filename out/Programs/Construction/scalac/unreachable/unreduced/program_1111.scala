package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_A[(Boolean,Byte), Int],Char), b: E) extends T_A[E, T_B[E, E]]
case class CC_B(a: Byte, b: T_A[T_A[Char, Int], T_B[T_A[Char, Int], T_A[Char, Int]]]) extends T_A[(CC_A[Int],CC_A[Boolean]), CC_A[T_B[Char, Byte]]]
case class CC_C(a: T_A[Int, T_B[Int, Int]], b: CC_A[T_A[CC_B, (Boolean,Boolean)]], c: T_A[CC_A[CC_B], T_B[CC_A[CC_B], CC_A[CC_B]]]) extends T_B[Char, Byte]
case class CC_D() extends T_B[Char, Byte]

val v_a: T_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)) => 0 
  case CC_D() => 1 
}
}