package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: (Byte,Char)) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: Pattern match is empty without constants