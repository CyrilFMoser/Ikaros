package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: (T_A[Char],T_A[CC_B]), b: T_A[Char], c: T_A[CC_A]) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
  case CC_C(_, _, _) => 2 
}
}