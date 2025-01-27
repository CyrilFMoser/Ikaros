package Program_30 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: (Boolean,Byte), b: T_B[Int], c: Boolean) extends T_A[C]
case class CC_B(a: T_A[(Char,Boolean)], b: T_A[Char]) extends T_A[CC_A[Char, Int]]

val v_a: T_A[CC_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A((_,0), _, _) => 0 
  case CC_A((_,_), _, _) => 1 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_B (CC_A (Tuple Char Boolean)
//            (T_A Boolean)
//            (Tuple Boolean Byte)
//            Wildcard
//            Wildcard
//            (T_A (Tuple Char Boolean)))
//      Wildcard
//      (T_A (CC_A Char Int Boolean Boolean Boolean Boolean)))
// This is not matched: (CC_C T_A T_A)