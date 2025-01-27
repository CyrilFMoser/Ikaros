package Program_15 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[(Byte,Byte), C]
case class CC_B[F, E](a: E, b: ((Int,Int),(Char,Boolean)), c: T_A[(Boolean,Boolean), Char]) extends T_A[E, F]

val v_a: T_A[(Byte,Byte), Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, ((_,_),(_,_)), _) => 1 
  case CC_B((0,0), ((_,_),(_,_)), _) => 2 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A (Tuple Byte Byte) Boolean))
// This is not matched: (CC_B Wildcard T_A)