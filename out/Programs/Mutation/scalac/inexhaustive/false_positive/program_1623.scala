package Program_62 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: (Char,Byte)) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, ('x',_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants