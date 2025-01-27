package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Int) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Int]], T_A[(Boolean,Int), T_A[Char, Int]]]
case class CC_B(a: CC_A, b: T_A[CC_A, CC_A]) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Int]], T_A[(Boolean,Int), T_A[Char, Int]]]
case class CC_C() extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Int]], T_A[(Boolean,Int), T_A[Char, Int]]]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Boolean, Int]], T_A[(Boolean,Int), T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_C() => 2 
}
}