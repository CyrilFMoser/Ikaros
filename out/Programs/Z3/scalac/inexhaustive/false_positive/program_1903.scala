package Program_31 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, Byte]
case class CC_B[E](a: T_A[E, Byte], b: (Char,(Boolean,Byte))) extends T_A[E, Byte]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_B(CC_A(), ('x',(_,_))) => 1 
  case CC_B(CC_A(), (_,(_,_))) => 2 
}
}
// This is not matched: (CC_B Char
//      (CC_A Char Boolean (T_A Char Byte))
//      (Tuple Char (Tuple Boolean Byte))
//      (T_A Char Byte))
// This is not matched: (CC_D (T_B (CC_B T_A) T_A))