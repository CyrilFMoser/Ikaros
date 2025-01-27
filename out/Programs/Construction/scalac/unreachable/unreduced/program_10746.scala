package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Boolean,Byte), T_A[Boolean, Byte]], b: Byte, c: T_A[Char, T_A[Boolean, Char]]) extends T_A[T_A[T_A[Int, Int], T_A[(Char,Byte), Boolean]], T_A[T_A[Byte, Int], T_A[(Boolean,Boolean), Byte]]]
case class CC_B(a: T_A[T_A[CC_A, CC_A], Char], b: Boolean, c: T_A[(CC_A,CC_A), Char]) extends T_A[T_A[CC_A, CC_A], Char]
case class CC_C() extends T_A[T_A[CC_A, CC_A], Char]

val v_a: T_A[T_A[CC_A, CC_A], Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, _) => 0 
  case CC_B(CC_C(), _, _) => 1 
  case CC_C() => 2 
}
}