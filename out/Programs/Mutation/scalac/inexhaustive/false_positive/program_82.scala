package Program_57 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: (T_B,T_B)) extends T_A[C, T_B]
case class CC_C(a: Char) extends T_B

val v_a: T_A[Char, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_C('x'))) => 0 
}
}
// This is not matched: (CC_E Byte (T_B Byte (T_A Char)))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
//  CC_B(_, _)
//  CC_C(_)
// }
//