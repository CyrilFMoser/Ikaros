package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: (Int,Byte)) extends T_A[D, C]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A((12,_)) => 0 
  case CC_A((12,0)) => 1 
  case CC_A(_) => 2 
  case CC_A((_,_)) => 3 
}
}
// This is not matched: (CC_A Int Byte Boolean Wildcard (T_A Byte Int))
// This is not matched: (CC_B Char
//      (CC_A Char
//            (CC_B Char (CC_A Char Wildcard (T_A Char)) (T_A Char))
//            (T_A Char))
//      (T_A Char))