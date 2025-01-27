package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Boolean) extends T_A[(Char,Int), T_A[T_A[Char, Int], T_A[Boolean, Boolean]]]
case class CC_B() extends T_A[(Char,Int), T_A[T_A[Char, Int], T_A[Boolean, Boolean]]]
case class CC_C(a: T_A[T_A[CC_B, CC_A], Byte], b: CC_A, c: CC_B) extends T_A[(Char,Int), T_A[T_A[Char, Int], T_A[Boolean, Boolean]]]

val v_a: T_A[(Char,Int), T_A[T_A[Char, Int], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}