package Program_30 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Boolean, c: (Boolean,T_B)) extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_C[B]() extends T_A[Char]
case class CC_D(a: Int, b: T_B, c: CC_A) extends T_B
case class CC_E(a: CC_D, b: Boolean, c: CC_D) extends T_B

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C() => 1 
  case CC_A(_, _, _) => 2 
  case CC_A(CC_E(_, _, _), _, (_,CC_E(_, _, _))) => 3 
  case CC_A(_, _, (_,CC_E(_, _, _))) => 4 
  case CC_A(CC_D(_, _, _), _, (_,CC_D(_, _, _))) => 5 
}
}
// This is not matched: (CC_C T_B (T_A Char))
// This is not matched: (CC_C Wildcard T_B)