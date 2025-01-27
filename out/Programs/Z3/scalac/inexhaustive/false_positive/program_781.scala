package Program_30 

package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(Byte,Int)]
case class CC_B[B](a: CC_A, b: (Boolean,Boolean)) extends T_A[(Byte,Int)]

val v_a: T_A[(Byte,Int)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), (_,_)) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A (Tuple Byte Int)))
// This is not matched: (CC_C Wildcard Wildcard T_A)