package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[T_A[C, C], C]
case class CC_B() extends T_B
case class CC_C(a: (T_B,(CC_B,T_B)), b: (Boolean,T_A[CC_B, CC_B]), c: Char) extends T_B
case class CC_D[D](a: T_A[T_A[CC_A[D], CC_A[D]], CC_A[D]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_B(),(_,_)), (_,_), _) => 1 
  case CC_C((CC_C(_, _, _),(_,_)), (_,_), _) => 2 
  case CC_D(_) => 3 
}
}
// This is not matched: CC_C((CC_D(_),(_,_)), (_,_), _)