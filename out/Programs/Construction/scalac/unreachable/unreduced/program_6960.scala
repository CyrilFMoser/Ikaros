package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean, b: T_A[T_A[(Int,Boolean), Byte], Int]) extends T_A[T_A[Byte, T_A[(Int,Int), (Boolean,Boolean)]], T_A[(Boolean,Boolean), T_A[Char, Byte]]]
case class CC_B() extends T_A[T_A[Byte, T_A[(Int,Int), (Boolean,Boolean)]], T_A[(Boolean,Boolean), T_A[Char, Byte]]]
case class CC_C() extends T_A[T_A[Byte, T_A[(Int,Int), (Boolean,Boolean)]], T_A[(Boolean,Boolean), T_A[Char, Byte]]]

val v_a: T_A[T_A[Byte, T_A[(Int,Int), (Boolean,Boolean)]], T_A[(Boolean,Boolean), T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()