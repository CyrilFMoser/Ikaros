package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[Byte], b: (Boolean,Int)) extends T_A[(Char,Boolean), Int]
case class CC_B() extends T_B[T_A[CC_A, CC_A]]

val v_a: T_A[(Char,Boolean), Int] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,12)) => 0 
}
}
// This is not matched: Pattern match is empty without constants