package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: Byte) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Int) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_A, b: CC_A) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A(_, _), CC_A(_, 0)) => 2 
  case CC_C(CC_A(_, _), CC_A(_, _)) => 3 
}
}