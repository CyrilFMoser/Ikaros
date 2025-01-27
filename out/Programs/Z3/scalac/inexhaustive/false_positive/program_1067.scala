package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[Byte], D]
case class CC_B(a: T_B[(Byte,Boolean)], b: (Byte,(Byte,Char))) extends T_B[CC_A[(Char,Char)]]

val v_a: T_B[CC_A[(Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_B(_, (0,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants