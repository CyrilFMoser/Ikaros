package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C) extends T_A[C]
case class CC_B(a: T_A[T_B[(Boolean,Char)]]) extends T_B[T_A[CC_A[Char]]]
case class CC_C(a: (Boolean,CC_A[Byte]), b: Byte) extends T_B[T_A[CC_A[Char]]]

val v_a: T_B[T_A[CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_A(_, _), _)) => 0 
  case CC_C((_,CC_A(_, _)), _) => 1 
}
}