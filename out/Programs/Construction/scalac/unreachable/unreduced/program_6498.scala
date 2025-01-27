package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A(a: Char, b: Boolean, c: (T_A[Boolean],T_A[Char])) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: (T_A[CC_A],T_A[CC_A]), b: CC_A, c: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C() extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((_,_), CC_A(_, _, _), _) => 1 
}
}
// This is not matched: CC_C()