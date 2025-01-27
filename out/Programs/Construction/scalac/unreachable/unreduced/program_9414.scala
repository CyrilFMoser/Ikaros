package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: Boolean) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_B, b: T_A[CC_A], c: (Char,(CC_B,(Int,Boolean)))) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}