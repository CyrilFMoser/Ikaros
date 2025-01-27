package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[Int], c: T_A[(Boolean,Boolean)]) extends T_A[Int]
case class CC_B(a: (T_A[Int],T_A[Int]), b: Boolean, c: T_A[((Boolean,Byte),CC_A)]) extends T_A[Int]
case class CC_C(a: (Byte,Boolean)) extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _), _), _) => 1 
  case CC_A(_, CC_A(_, CC_C(_), _), _) => 2 
  case CC_A(_, CC_B((_,_), _, _), _) => 3 
  case CC_A(_, CC_C((_,_)), _) => 4 
  case CC_B((CC_A(_, _, _),CC_A(_, _, _)), _, _) => 5 
  case CC_B((CC_A(_, _, _),CC_B(_, _, _)), _, _) => 6 
  case CC_B((CC_A(_, _, _),CC_C(_)), _, _) => 7 
  case CC_B((CC_B(_, _, _),CC_A(_, _, _)), _, _) => 8 
  case CC_B((CC_B(_, _, _),CC_B(_, _, _)), _, _) => 9 
  case CC_B((CC_B(_, _, _),CC_C(_)), _, _) => 10 
  case CC_B((CC_C(_),CC_A(_, _, _)), _, _) => 11 
  case CC_B((CC_C(_),CC_B(_, _, _)), _, _) => 12 
  case CC_B((CC_C(_),CC_C(_)), _, _) => 13 
  case CC_C((_,true)) => 14 
  case CC_C((_,false)) => 15 
}
}