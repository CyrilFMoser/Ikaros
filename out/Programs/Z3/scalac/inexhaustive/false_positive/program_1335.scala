package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]
case class CC_B() extends T_A[(Boolean,Char)]
case class CC_C[C](a: T_A[C], b: C) extends T_A[(Boolean,Char)]

val v_a: T_A[(Boolean,Char)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: (CC_C Boolean Wildcard Wildcard (T_A (Tuple Boolean Char)))
// This is not matched: (CC_B (T_A (Tuple Boolean Char)))