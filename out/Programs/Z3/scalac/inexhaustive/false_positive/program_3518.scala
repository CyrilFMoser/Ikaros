package Program_11 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B[B, C](a: CC_A) extends T_B[B]
case class CC_C(a: (CC_A,(Int,Char)), b: T_A, c: Int) extends T_B[T_B[CC_A]]
case class CC_D() extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_D() => 1 
  case CC_C((CC_A(_),(_,_)), CC_A(_), _) => 2 
  case CC_C((CC_A(_),(_,_)), CC_A(_), 12) => 3 
  case CC_C((CC_A(_),(_,_)), _, _) => 4 
}
}
// This is not matched: (CC_B (T_B (CC_A T_A T_A)) T_A Wildcard (T_B (T_B (CC_A T_A T_A))))
// This is not matched: Pattern match is empty without constants