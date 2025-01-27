package Program_11 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B, C](a: (CC_A,T_A)) extends T_B[B]
case class CC_C() extends T_B[(CC_A,CC_A)]
case class CC_D(a: T_B[CC_A], b: CC_B[Byte, T_A], c: T_A) extends T_B[(CC_A,CC_A)]

val v_a: T_B[(CC_A,CC_A)] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(_, _, _) => 2 
  case CC_D(CC_B(_), _, CC_A()) => 3 
  case CC_D(_, CC_B(_), _) => 4 
  case CC_D(CC_B(_), CC_B(_), _) => 5 
}
}
// This is not matched: (CC_B (Tuple (CC_A T_A) (CC_A T_A))
//      T_A
//      Wildcard
//      (T_B (Tuple (CC_A T_A) (CC_A T_A))))
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Char))