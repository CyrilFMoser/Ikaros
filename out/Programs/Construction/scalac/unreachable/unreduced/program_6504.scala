package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: (T_A[Char, (Int,Boolean)],((Boolean,Int),Boolean))) extends T_A[C, (T_A[Int, (Boolean,Boolean)],T_A[Boolean, Char])]
case class CC_B[D, E]() extends T_A[D, (T_A[Int, (Boolean,Boolean)],T_A[Boolean, Char])]
case class CC_C(a: (CC_A[Char],CC_A[(Char,Char)])) extends T_A[(T_A[Char, Byte],CC_A[Boolean]), (T_A[Int, (Boolean,Boolean)],T_A[Boolean, Char])]

val v_a: T_A[T_A[(T_A[Char, Byte],CC_A[Boolean]), (T_A[Int, (Boolean,Boolean)],T_A[Boolean, Char])], (T_A[Int, (Boolean,Boolean)],T_A[Boolean, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,(_,_))) => 0 
  case CC_B() => 1 
}
}