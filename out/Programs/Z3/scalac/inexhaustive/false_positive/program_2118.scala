package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Char]
case class CC_B(a: T_A[T_B], b: (Byte,CC_A)) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, (0,_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants