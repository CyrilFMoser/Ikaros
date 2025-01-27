package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Int, Int], T_A[Boolean, (Boolean,Char)]], T_A[(Int,(Int,Byte)), T_A[Int, Char]]]
case class CC_B(a: CC_A, b: CC_A, c: T_A[CC_A, T_A[Byte, CC_A]]) extends T_A[T_A[T_A[Int, Int], T_A[Boolean, (Boolean,Char)]], T_A[(Int,(Int,Byte)), T_A[Int, Char]]]
case class CC_C(a: CC_A) extends T_A[T_A[T_A[Int, Int], T_A[Boolean, (Boolean,Char)]], T_A[(Int,(Int,Byte)), T_A[Int, Char]]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Boolean, (Boolean,Char)]], T_A[(Int,(Int,Byte)), T_A[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_A(), _) => 0 
  case CC_C(CC_A()) => 1 
}
}
// This is not matched: CC_A()