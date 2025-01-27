package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[Byte]]
case class CC_B(a: T_A[CC_A], b: (Boolean,Char)) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,'x')) => 0 
}
}
// This is not matched: Pattern match is empty without constants