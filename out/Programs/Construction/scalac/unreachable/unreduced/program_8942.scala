package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Char,Boolean)], b: T_A[Int], c: Char) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C() extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 'x') => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(CC_A(_, _, 'x')) => 2 
  case CC_B(CC_A(_, _, _)) => 3 
  case CC_C() => 4 
}
}