package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, (Boolean,(Char,Char))]
case class CC_B[D](a: CC_A[D], b: Char, c: (T_A[(Boolean,Boolean), Int],CC_A[Boolean])) extends T_A[D, (Boolean,(Char,Char))]
case class CC_C[E](a: (CC_A[Byte],(Char,Byte))) extends T_A[E, (Boolean,(Char,Char))]

val v_a: T_A[Byte, (Boolean,(Char,Char))] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, (_,_)) => 1 
  case CC_C((_,_)) => 2 
}
}