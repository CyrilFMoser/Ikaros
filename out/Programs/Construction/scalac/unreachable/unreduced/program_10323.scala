package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Byte]
case class CC_B(a: ((CC_A,CC_A),T_A[Int]), b: T_A[Byte]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(((_,_),_), CC_A()) => 1 
  case CC_B(((_,_),_), CC_B((_,_), CC_B(_, _))) => 2 
}
}
// This is not matched: CC_B(((_,_),_), CC_B((_,_), CC_A()))