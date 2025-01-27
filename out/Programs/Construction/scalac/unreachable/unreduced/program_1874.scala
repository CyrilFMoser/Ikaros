package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Byte]
case class CC_B(a: (T_A[Char],T_A[CC_A])) extends T_A[Byte]
case class CC_C(a: T_A[CC_B], b: Int, c: CC_A) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_)) => 1 
}
}
// This is not matched: CC_C(_, _, _)