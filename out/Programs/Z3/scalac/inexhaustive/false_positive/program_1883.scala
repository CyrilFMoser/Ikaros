package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: ((Boolean,Boolean),Int)) extends T_A[C, (Int,(Byte,Char))]

val v_a: T_A[Int, (Int,(Byte,Char))] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,12)) => 0 
}
}
// This is not matched: Pattern match is empty without constants