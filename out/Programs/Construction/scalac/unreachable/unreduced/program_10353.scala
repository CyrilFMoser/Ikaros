package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Int, T_A[T_B, (Boolean,Char)]]) extends T_A[(T_A[T_B, T_B],T_B), (Char,T_B)]
case class CC_B(a: T_A[T_B, T_B], b: Char, c: CC_A) extends T_A[(T_A[T_B, T_B],T_B), (Char,T_B)]
case class CC_C(a: T_A[T_A[CC_B, CC_A], CC_B], b: (T_A[CC_A, T_B],T_B), c: CC_B) extends T_B
case class CC_D(a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B(_, _, _)) => 0 
  case CC_D(_) => 1 
}
}