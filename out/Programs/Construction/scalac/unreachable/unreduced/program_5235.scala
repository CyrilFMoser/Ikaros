package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[((Char,Int),Int)], b: T_A[T_A[(Byte,Int)]]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A, b: Boolean, c: Int) extends T_A[T_A[T_A[Char]]]
case class CC_C() extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _, _) => 1 
  case CC_C() => 2 
}
}