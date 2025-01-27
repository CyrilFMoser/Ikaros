package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: Boolean, b: T_A[D, E], c: T_A[E, E]) extends T_A[D, E]
case class CC_B() extends T_B[T_A[T_A[Byte, Int], T_B[Char]]]
case class CC_C(a: CC_B, b: Int, c: (CC_B,(Boolean,(Byte,Byte)))) extends T_B[T_A[T_A[Byte, Int], T_B[Char]]]
case class CC_D(a: T_B[Boolean], b: CC_C) extends T_B[T_A[T_A[Byte, Int], T_B[Char]]]

val v_a: T_B[T_A[T_A[Byte, Int], T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), _, (CC_B(),(_,_))) => 0 
  case CC_D(_, CC_C(CC_B(), 12, (_,_))) => 1 
  case CC_D(_, CC_C(CC_B(), _, (_,_))) => 2 
}
}
// This is not matched: CC_B()