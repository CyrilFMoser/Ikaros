package Program_22 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[(Int,Boolean)]) extends T_A[T_A[(Boolean,Char)]]
case class CC_B(a: (CC_A,Byte), b: (T_A[CC_A],Boolean)) extends T_A[T_A[(Boolean,Char)]]
case class CC_C(a: CC_B, b: CC_B) extends T_A[T_A[(Boolean,Char)]]

val v_a: T_A[T_A[(Boolean,Char)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B((CC_A(_, _),0), (_,true)) => 1 
  case CC_B((CC_A(_, _),0), (_,false)) => 2 
  case CC_B((CC_A(_, _),_), (_,true)) => 3 
  case CC_B((CC_A(_, _),_), (_,false)) => 4 
  case CC_C(_, CC_B(_, _)) => 5 
}
}