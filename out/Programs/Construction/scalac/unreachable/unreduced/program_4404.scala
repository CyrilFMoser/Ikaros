package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B(a: CC_A[T_A[(Char,Boolean), (Int,Char)]]) extends T_B
case class CC_C(a: CC_A[Boolean], b: T_A[CC_A[T_B], Char], c: Boolean) extends T_B
case class CC_D(a: T_A[T_B, Int], b: ((Boolean,CC_C),T_B)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_A(CC_A(_)), ((_,_),CC_B(_))) => 1 
  case CC_D(CC_A(CC_A(_)), ((_,_),CC_C(_, _, _))) => 2 
  case CC_D(CC_A(CC_A(_)), ((_,_),CC_D(_, _))) => 3 
}
}
// This is not matched: CC_B(_)