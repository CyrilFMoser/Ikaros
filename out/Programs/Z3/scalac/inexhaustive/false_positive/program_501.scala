package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C) extends T_A[C, D]
case class CC_B[E](a: Boolean, b: Byte, c: (Boolean,Boolean)) extends T_A[T_A[Char, Byte], CC_A[(Char,Int), Boolean]]

val v_a: T_A[T_A[Char, Byte], CC_A[(Char,Int), Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, (_,_)) => 1 
  case CC_B(_, 0, _) => 2 
}
}
// This is not matched: (CC_B Boolean
//      Boolean
//      Wildcard
//      (Tuple Wildcard Boolean)
//      (T_A (T_A Char Byte) (CC_A (Tuple Char Int) Boolean Boolean Boolean)))
// This is not matched: Pattern match is empty without constants